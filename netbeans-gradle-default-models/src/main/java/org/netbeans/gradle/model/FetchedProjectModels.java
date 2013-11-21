package org.netbeans.gradle.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.netbeans.gradle.model.util.CollectionUtils;

public final class FetchedProjectModels implements Serializable {
    private static final long serialVersionUID = 1L;

    private final GradleMultiProjectDef projectDef;
    private final Map<Object, List<?>> projectInfoResults;
    private final Map<Class<?>, Object> toolingModels;

    public FetchedProjectModels(
            GradleMultiProjectDef projectDef,
            Map<Object, List<?>> projectInfoResults,
            Map<Class<?>, Object> toolingModels) {
        if (projectDef == null) throw new NullPointerException("projectDef");

        this.projectDef = projectDef;
        this.projectInfoResults = CollectionUtils.copyNullSafeMultiHashMap(projectInfoResults);
        this.toolingModels = CollectionUtils.copyNullSafeHashMap(toolingModels);
    }

    public GradleMultiProjectDef getProjectDef() {
        return projectDef;
    }

    public Map<Object, List<?>> getProjectInfoResults() {
        return projectInfoResults;
    }

    public Map<Class<?>, Object> getToolingModels() {
        return toolingModels;
    }
}
