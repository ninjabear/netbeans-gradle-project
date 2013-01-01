package org.netbeans.gradle.project.properties;

import java.io.File;
import java.net.URI;

public interface GradleLocation {
    // When creating new implementations of GradleLocation, don't forget to
    // update AbstractProjectProperties.getGradleLocationFromString.

    public static interface Applier {
        public void applyVersion(String versionStr);
        public void applyDirectory(File gradleHome);
        public void applyDistribution(URI location);
        public void applyDefault();
    }

    public void applyLocation(Applier applier);
    public String getUniqueTypeName();
    public String asString();
}
