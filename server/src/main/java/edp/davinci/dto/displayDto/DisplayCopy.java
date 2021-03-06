/*
 * <<
 *  Davinci
 *  ==
 *  Copyright (C) 2016 - 2020 EDP
 *  ==
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  >>
 */

package edp.davinci.dto.displayDto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NotNull(message = "Copy display info cannot be null")
public class DisplayCopy {
    @NotBlank(message = "Display name cannot be empty")
    private String name;
    private String description;
    private Boolean publish = false;
    private List<Long> roleIds;
}
