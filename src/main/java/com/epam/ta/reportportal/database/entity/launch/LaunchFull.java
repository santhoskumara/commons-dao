package com.epam.ta.reportportal.database.entity.launch;

import java.util.Objects;

/**
 * @author Pavel Bortnik
 */
public class LaunchFull {

	private Launch launch;

	private ExecutionStatistics executionStatistics;

	public LaunchFull(Launch launch, ExecutionStatistics executionStatistics) {
		this.launch = launch;
		this.executionStatistics = executionStatistics;
	}

	public Launch getLaunch() {
		return launch;
	}

	public void setLaunch(Launch launch) {
		this.launch = launch;
	}

	public ExecutionStatistics getExecutionStatistics() {
		return executionStatistics;
	}

	public void setExecutionStatistics(ExecutionStatistics executionStatistics) {
		this.executionStatistics = executionStatistics;
	}

	@Override
	public String toString() {
		return "LaunchFull{" + "launch=" + launch + ", executionStatistics=" + executionStatistics + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LaunchFull that = (LaunchFull) o;
		return Objects.equals(launch, that.launch) && Objects.equals(executionStatistics, that.executionStatistics);
	}

	@Override
	public int hashCode() {
		return Objects.hash(launch, executionStatistics);
	}
}
