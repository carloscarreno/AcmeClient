package com.pamtraining.acmeproject;

import java.util.HashMap;
import java.util.Map;

import com.pamtraining.gestorcredito.CreditInfo;

public class Application {

	public static void main(String[] args) {
		KieHelper helper =  new KieHelper();
		String containerId= "GestorCredito_1.0.0-SNAPSHOT";
		String processName = "GestorCredito.bmpEvaluacionCredito";
		Map<String,Object> variables= null;
		
		CreditInfo creditInfo = new CreditInfo();
		creditInfo.setId(100);
		creditInfo.setCliente("Charly Brown");
		creditInfo.setMonto(50000.0);
		
		variables = new HashMap<String,Object>();
		variables.put("creditinfo", creditInfo);
		
//		Long instanceId = helper.startProcess(containerId, processName, variables);
//		System.out.println("Proceso: "+processName+", instancia iniciada: "+instanceId);
        
		helper.USERNAME = "jhon";
		helper.PASSWORD = "jhon";
		Long taskId = 11L;
		String user = "jhon";
//		helper.startTask(containerId, taskId, user);
//      System.out.println(" Containerid :"+containerId+ " tarea iniciada: "+taskId +" por el usuario: "+user);
        
        Map<String,Object> params = new HashMap<String, Object>();
        params.put("localDocAprobado", new Boolean(true));
        helper.completeTask(containerId, taskId, user, params);
        System.out.println(" Containerid :"+containerId+ " tarea COMPLETADA: "+taskId +" por el usuario: "+user);
        
        
	}

}
