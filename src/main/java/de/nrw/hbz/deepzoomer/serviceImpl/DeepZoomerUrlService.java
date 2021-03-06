/**
 * 
 */
package de.nrw.hbz.deepzoomer.serviceImpl;

import org.apache.log4j.Logger;

import de.nrw.hbz.deepzoomer.fileUtil.FileUtil;
import de.nrw.hbz.deepzoomer.util.DziResult;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import com.sun.jersey.api.json.JSONWithPadding;

import java.io.File;
import java.io.IOException;



/**
 * @author aquast
 *
 */

@Path("/getDzi")
public class DeepZoomerUrlService {
	// Initiate Logger for PilotRunner
	private static Logger log = Logger.getLogger(DeepZoomerUrlService.class);

	//  Jersey annotated Methods 	
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	public DziResult getDZI(@QueryParam("imageUrl") String imageUrl){
		
		DziResult dziRes = null;		
		dziRes = getDziResult(imageUrl);
		return dziRes;
	}
	
	@GET
	@Produces({"application/x-javascript", MediaType.APPLICATION_JSON})
	public JSONWithPadding getDZIJsonP(
			@QueryParam("callback") @DefaultValue("fn") String callback,
			@QueryParam("imageUrl") String imageUrl) {

		return new JSONWithPadding(getDziResult(imageUrl), callback);
	}
	
	
	private DziResult getDziResult(String imageUrl){
		DziResult dzi = null;
		
		String fileName = imageUrl.replaceAll("\\W", "").replace("https", "")
				.replace("http", "").replace("file", "");
		log.info(fileName);
		if (new File(Configuration.getResultDirPath()+ fileName + ".dzi").isFile()){
			//nothing to do here
			log.debug("use cached DeepZoom-Images");
		} else {
			log.debug("create new DeepZoom-Images");
			log.info(FileUtil.saveUrlToFile(fileName, imageUrl));
			
			VipsRunner vips = new VipsRunner();
			vips.executeVips("", fileName);
		}
		dzi =  new DziResult(fileName);
		return dzi;
	}
}
