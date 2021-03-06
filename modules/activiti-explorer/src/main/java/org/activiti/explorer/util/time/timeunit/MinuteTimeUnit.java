/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.explorer.util.time.timeunit;

import org.activiti.explorer.Messages;
import org.activiti.explorer.util.time.TimeUnit;


/**
 * @author Frederik Heremans
 */
public class MinuteTimeUnit implements TimeUnit {

  private static final Long MILLIS_PER_MINUTE = 60000L;
  
  public Long getNumberOfMillis() {
    return MILLIS_PER_MINUTE;
  }

  public String getMessageKey(Long numberOfUnits) {
    if(numberOfUnits == 1) {
      return Messages.TIME_UNIT_MINUTE;
    } else {
      return Messages.TIME_UNIT_MINUTES;
    }
  }

}
