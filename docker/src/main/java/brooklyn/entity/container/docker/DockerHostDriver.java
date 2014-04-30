/*
 * Copyright 2014 by Cloudsoft Corporation Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package brooklyn.entity.container.docker;

import brooklyn.entity.basic.SoftwareProcessDriver;
import brooklyn.util.task.system.ProcessTaskWrapper;

/**
 *
 * The {@link brooklyn.entity.basic.SoftwareProcessDriver} for Docker.
 *
 * @author Andrea Turli
 */
public interface DockerHostDriver extends SoftwareProcessDriver {
    Integer getDockerPort();

    ProcessTaskWrapper<Integer> executeScriptAsync(String dockerFile, String folder);
}
