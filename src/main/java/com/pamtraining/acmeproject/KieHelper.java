package com.pamtraining.acmeproject;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.UserTaskServicesClient;

import com.pamtraining.gestorcredito.CreditInfo;

public class KieHelper {

	String URL_KIE_SERVER = "http://192.168.56.108:8080/kie-server/services/rest/server";
	public String USERNAME = "rhpamAdmin";
	public String PASSWORD = "rhpamAdmin1!";
	
	public KieServicesClient getKieServicesClient() {
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(URL_KIE_SERVER, USERNAME, PASSWORD);
		config.setMarshallingFormat(MarshallingFormat.JSON);
		Set<Class<?>> extraClassList = new HashSet<Class<?>>();
		extraClassList.add(CreditInfo.class);
		config.addExtraClasses(extraClassList);
		return KieServicesFactory.newKieServicesClient(config);
	}
	
	public Long startProcess(String containderId,String processName, Map<String,Object> variables) {
		ProcessServicesClient processClient = getKieServicesClient().getServicesClient(ProcessServicesClient.class);
		Long id = 0L;
		if (variables != null)
			id = processClient.startProcess(containderId, processName,variables);
		else
		    id = processClient.startProcess(containderId, processName);
		return id;
	}
	
	public void startTask(String containerId,Long taskId,String user) {
		UserTaskServicesClient userTaskClient = getKieServicesClient().getServicesClient(UserTaskServicesClient.class);
		userTaskClient.startTask(containerId, taskId, user);
	}
	
    public void completeTask(String containerId,Long taskId,String user, Map<String,Object> locales) {
    	UserTaskServicesClient userTaskClient = getKieServicesClient().getServicesClient(UserTaskServicesClient.class);
    	userTaskClient.completeTask(containerId, taskId, user, locales);
    }	
	
}
