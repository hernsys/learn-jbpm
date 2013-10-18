package com.hernsys.sample;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.test.JbpmJUnitTestCase;
import org.junit.Test;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

import com.hernsys.model.Person;

//chapter 5 and chapter 6.7 in jbpm6
public class Step3 extends JbpmJUnitTestCase {
	
	public Step3() {
		super(true);
		setPersistence(true);
	}

	@Test
	public void testScript() {
		//knowlege base
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("Step3.bpmn"), ResourceType.BPMN2);
		KnowledgeBase kbase = kbuilder.newKnowledgeBase();
		
		//session
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("person", new Person("horacio"));
		ProcessInstance processInstance = ksession.startProcess("com.hernsys.step3", params);

		

	}

}
