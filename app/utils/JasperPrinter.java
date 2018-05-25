package utils;


import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

import com.google.inject.Inject;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.ExporterInput;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import play.api.Environment;;


public class JasperPrinter {
	
	@Inject
	private ConnectionUtils connectionUtils;
	@Inject
	Environment env;
		
	public void print(){
		
		String ret = env.rootPath().getAbsolutePath() + "/public/" + "etat/";
		String publicDir = env.rootPath().getAbsolutePath() + "/public/" + "template/exemple.jrxml";
		
		try {
			
			JasperReport jasperReport = JasperCompileManager.compileReport(publicDir);
			
			Connection conn = connectionUtils.getConnection();
		
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<String, Object>(), conn);
			
			// Make sure the output directory exists.
			File outDir = new File(ret);
			outDir.mkdirs();

			// PDF Exportor.
			JRPdfExporter exporter = new JRPdfExporter();

			ExporterInput exporterInput = new SimpleExporterInput(jasperPrint);
			// ExporterInput
			exporter.setExporterInput(exporterInput);
			
			// ExporterOutput
			OutputStreamExporterOutput exporterOutput = new SimpleOutputStreamExporterOutput(ret +"exemple"+ ".pdf");

			// Output
			exporter.setExporterOutput(exporterOutput);
			
			//
			SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
			exporter.setConfiguration(configuration);
			exporter.exportReport();
			System.out.println("done!");
		} 
		catch (JRException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}	
