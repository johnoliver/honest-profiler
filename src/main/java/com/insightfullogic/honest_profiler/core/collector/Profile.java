package com.insightfullogic.honest_profiler.core.collector;

import java.util.List;
import java.util.stream.Stream;

/**
 * An event that represents the collected results of some profiling activity.
 */
public final class Profile {

    private final int traceCount;
    private List<ProfileTree> trees;
    private List<FlatProfileEntry> flatProfile;

    public Profile(int traceCount, List<FlatProfileEntry> flatProfile, List<ProfileTree> trees) {
        this.traceCount = traceCount;
        this.flatProfile = flatProfile;
        this.trees = trees;
    }

    public int getTraceCount() {
        return traceCount;
    }

    public List<FlatProfileEntry> getFlatProfile() {
        return flatProfile;
    }

    public Stream<FlatProfileEntry> flatProfile() {
        return flatProfile.stream();
    }

    public List<ProfileTree> getTrees() {
        return trees;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "traceCount: " + traceCount +
                ", count(trees): " + trees +
                '}';
    }

}
