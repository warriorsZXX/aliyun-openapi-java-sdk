/*
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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetMsSgCircuitBreakerRuleResponse;
import com.aliyuncs.sofa.model.v20190815.GetMsSgCircuitBreakerRuleResponse.RuleModelsItem;
import com.aliyuncs.sofa.model.v20190815.GetMsSgCircuitBreakerRuleResponse.RuleModelsItem.ConditionsItem;
import com.aliyuncs.sofa.model.v20190815.GetMsSgCircuitBreakerRuleResponse.RuleModelsItem.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMsSgCircuitBreakerRuleResponseUnmarshaller {

	public static GetMsSgCircuitBreakerRuleResponse unmarshall(GetMsSgCircuitBreakerRuleResponse getMsSgCircuitBreakerRuleResponse, UnmarshallerContext _ctx) {
		
		getMsSgCircuitBreakerRuleResponse.setRequestId(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RequestId"));
		getMsSgCircuitBreakerRuleResponse.setResultCode(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.ResultCode"));
		getMsSgCircuitBreakerRuleResponse.setResultMessage(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.ResultMessage"));
		getMsSgCircuitBreakerRuleResponse.setCurrentPage(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.CurrentPage"));
		getMsSgCircuitBreakerRuleResponse.setPageSize(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.PageSize"));
		getMsSgCircuitBreakerRuleResponse.setStartIndex(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.StartIndex"));
		getMsSgCircuitBreakerRuleResponse.setTotalSize(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.TotalSize"));

		List<RuleModelsItem> ruleModels = new ArrayList<RuleModelsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMsSgCircuitBreakerRuleResponse.RuleModels.Length"); i++) {
			RuleModelsItem ruleModelsItem = new RuleModelsItem();
			ruleModelsItem.setDataId(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].DataId"));
			ruleModelsItem.setGmtModified(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].GmtModified"));
			ruleModelsItem.setId(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Id"));
			ruleModelsItem.setInstanceId(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].InstanceId"));
			ruleModelsItem.setMode(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Mode"));
			ruleModelsItem.setName(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Name"));
			ruleModelsItem.setOperator(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Operator"));
			ruleModelsItem.setServiceType(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].ServiceType"));
			ruleModelsItem.setStatus(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Status"));

			List<String> appNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].AppNames.Length"); j++) {
				appNames.add(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].AppNames["+ j +"]"));
			}
			ruleModelsItem.setAppNames(appNames);

			Config config = new Config();
			config.setErrorPercentThreshold(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Config.ErrorPercentThreshold"));
			config.setProviderTimeout(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Config.ProviderTimeout"));
			config.setRequestVolumeThreshold(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Config.RequestVolumeThreshold"));
			config.setSleepWindow(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Config.SleepWindow"));
			config.setTotalMetricWindow(_ctx.longValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Config.TotalMetricWindow"));
			ruleModelsItem.setConfig(config);

			List<ConditionsItem> conditions = new ArrayList<ConditionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Conditions.Length"); j++) {
				ConditionsItem conditionsItem = new ConditionsItem();
				conditionsItem.setField(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Conditions["+ j +"].Field"));
				conditionsItem.setOperation(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Conditions["+ j +"].Operation"));
				conditionsItem.setType(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Conditions["+ j +"].Type"));

				List<String> value = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Conditions["+ j +"].Value.Length"); k++) {
					value.add(_ctx.stringValue("GetMsSgCircuitBreakerRuleResponse.RuleModels["+ i +"].Conditions["+ j +"].Value["+ k +"]"));
				}
				conditionsItem.setValue(value);

				conditions.add(conditionsItem);
			}
			ruleModelsItem.setConditions(conditions);

			ruleModels.add(ruleModelsItem);
		}
		getMsSgCircuitBreakerRuleResponse.setRuleModels(ruleModels);
	 
	 	return getMsSgCircuitBreakerRuleResponse;
	}
}