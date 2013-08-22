learn-jbpm
==========
This project was configured with "jbpm instaler".
Add this project in eclipse the similar way that "evolution example"
---------------------------

The .classpath is similar to:
<?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="src" path="src/main/java"/>
	<classpathentry kind="src" path="src/main/resources"/>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER"/>
	<classpathentry kind="con" path="JBPM/jbpm"/>
	<classpathentry kind="con" path="org.eclipse.jdt.junit.JUNIT_CONTAINER/4"/>
	<classpathentry kind="output" path="bin"/>
</classpath>

---------------------------------

The .project is similar to:
<?xml version="1.0" encoding="UTF-8"?>
<projectDescription>
	<name>learn-jbpm</name>
	<comment></comment>
	<projects>
	</projects>
	<buildSpec>
		<buildCommand>
			<name>org.eclipse.jdt.core.javabuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.drools.eclipse.jbpmbuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.drools.eclipse.droolsbuilder</name>
			<arguments>
			</arguments>
		</buildCommand>
		<buildCommand>
			<name>org.eclipse.bpmn2.modeler.core.bpmn2Builder</name>
			<arguments>
			</arguments>
		</buildCommand>
	</buildSpec>
	<natures>
		<nature>org.eclipse.jdt.core.javanature</nature>
		<nature>org.eclipse.bpmn2.modeler.core.bpmn2Nature</nature>
	</natures>
</projectDescription>

