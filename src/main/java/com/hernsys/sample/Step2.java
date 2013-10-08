package com.hernsys.sample;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.test.JbpmJUnitTestCase;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

import com.hernsys.model.Person;


public class Step2 extends JbpmJUnitTestCase {
	
	public Step2() {
		super(true);
		setPersistence(true);
	}

	@Test
	public void testScript() {
		KieSession ksession = createKnowledgeSession("Step2.bpmn");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("person", new Person("horacio"));
		ksession.startProcess("HR.Step2", params);
	}

}
