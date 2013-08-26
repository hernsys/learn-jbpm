package com.hernsys.sample;

import org.drools.core.process.instance.WorkItemHandler;

public class Notification implements WorkItemHandler {

	@Override
	public void abortWorkItem(org.kie.api.runtime.process.WorkItem arg0,
			org.kie.api.runtime.process.WorkItemManager arg1) {
		System.out.println("aborting abortWorkItem");

	}

	@Override
	public void executeWorkItem(org.kie.api.runtime.process.WorkItem workItem,
			org.kie.api.runtime.process.WorkItemManager manager) {
		try {
			String from = (String) workItem.getParameter("From");
			String to = (String) workItem.getParameter("To");
			String msg = (String) workItem.getParameter("Body");
			String subject = (String) workItem.getParameter("Subject");
			// send email
			// Mailing mail_service=new Mailing();
			// mail_service.send(from, to, subject, msg);
			System.out.println("e-mail msg: " + msg + " is sent *****from " + from
					+ " ** to ** " + to + " ** subject ** " + subject);
			manager.completeWorkItem(workItem.getId(), null);
		} catch (Exception e) {
			manager.abortWorkItem(workItem.getId());
		}

	}

}
