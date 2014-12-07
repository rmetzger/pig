package org.apache.pig.backend.hadoop.executionengine.flink;

import org.apache.pig.backend.BackendException;
import org.apache.pig.backend.datastorage.DataStorage;
import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.backend.executionengine.ExecutionEngine;
import org.apache.pig.impl.PigContext;
import org.apache.pig.impl.logicalLayer.FrontendException;
import org.apache.pig.impl.plan.PlanException;
import org.apache.pig.impl.plan.VisitorException;
import org.apache.pig.impl.streaming.ExecutableManager;
import org.apache.pig.newplan.logical.relational.LogicalPlan;
import org.apache.pig.tools.pigstats.PigStats;
import org.apache.pig.tools.pigstats.ScriptState;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;


public class FlinkExecutionEngine implements ExecutionEngine {

	@Override
	public void init() throws ExecException {

	}

	@Override
	public void setConfiguration(Properties newConfiguration) throws ExecException {

	}

	@Override
	public void setProperty(String property, String value) {

	}

	@Override
	public Properties getConfiguration() {
		return null;
	}

	@Override
	public PigStats launchPig(LogicalPlan lp, String grpName, PigContext pc) throws FrontendException, ExecException {
		return null;
	}

	@Override
	public void explain(LogicalPlan lp, PigContext pc, PrintStream ps, String format, boolean verbose, File dir, String suffix) throws PlanException, VisitorException, IOException {

	}

	@Override
	public DataStorage getDataStorage() {
		return null;
	}

	@Override
	public ScriptState instantiateScriptState() {
		return null;
	}

	@Override
	public PigStats instantiatePigStats() {
		return null;
	}

	@Override
	public ExecutableManager getExecutableManager() {
		return null;
	}

	@Override
	public void killJob(String jobID) throws BackendException {

	}

	@Override
	public void destroy() {

	}
}
