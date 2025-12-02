package maven_archetype_quickstart.Oscar;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import maven_archetype_quickstart.Oscar;

@Suite
@SelectClasses({
    Oscar.class,
})

public class Oscar {
}

