package org.ballerinax.kubernetes.test.samples;

import org.ballerinax.kubernetes.test.utils.TestRunnerUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestSample4 implements SampleTester {

    @Test
    public void compileSample() throws IOException, InterruptedException {
        Assert.assertEquals(TestRunnerUtils.compileBallerinaFile
                (SAMPLE_DIR + File.separator + "sample4",
                        "hello_world_ssl_k8s.bal"), 0);
    }
}
