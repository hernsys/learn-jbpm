package com.hernsys.sample;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.test.JbpmJUnitTestCase;
import org.junit.Test;
import org.kie.api.runtime.KieSession;

import com.hernsys.model.Person;


public class ScriptTest extends JbpmJUnitTestCase {
	
	public ScriptTest() {
		super(true);
		setPersistence(true);
	}

	@Test
	public void testScript() {
		KieSession ksession = createKnowledgeSession("script.bpmn");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("person", new Person("horacio"));
		ksession.startProcess("com.sample.script", params);
	}

}
