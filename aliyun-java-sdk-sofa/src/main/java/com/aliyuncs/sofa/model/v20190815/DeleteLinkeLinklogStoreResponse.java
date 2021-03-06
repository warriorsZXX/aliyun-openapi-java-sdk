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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DeleteLinkeLinklogStoreResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteLinkeLinklogStoreResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMsg;

	private String responseContentRange;

	private String responseContentType;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getResponseContentRange() {
		return this.responseContentRange;
	}

	public void setResponseContentRange(String responseContentRange) {
		this.responseContentRange = responseContentRange;
	}

	public String getResponseContentType() {
		return this.responseContentType;
	}

	public void setResponseContentType(String responseContentType) {
		this.responseContentType = responseContentType;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long begin;

		private Long beginMills;

		private Long currentPage;

		private Long end;

		private Long endMills;

		private String envPattern;

		private Long gmtCreate;

		private Long gmtModified;

		private Long id;

		private String name;

		private String ownerId;

		private Long pageSize;

		private String sorter;

		private String stepPattern;

		public Long getBegin() {
			return this.begin;
		}

		public void setBegin(Long begin) {
			this.begin = begin;
		}

		public Long getBeginMills() {
			return this.beginMills;
		}

		public void setBeginMills(Long beginMills) {
			this.beginMills = beginMills;
		}

		public Long getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Long currentPage) {
			this.currentPage = currentPage;
		}

		public Long getEnd() {
			return this.end;
		}

		public void setEnd(Long end) {
			this.end = end;
		}

		public Long getEndMills() {
			return this.endMills;
		}

		public void setEndMills(Long endMills) {
			this.endMills = endMills;
		}

		public String getEnvPattern() {
			return this.envPattern;
		}

		public void setEnvPattern(String envPattern) {
			this.envPattern = envPattern;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public String getSorter() {
			return this.sorter;
		}

		public void setSorter(String sorter) {
			this.sorter = sorter;
		}

		public String getStepPattern() {
			return this.stepPattern;
		}

		public void setStepPattern(String stepPattern) {
			this.stepPattern = stepPattern;
		}
	}

	@Override
	public DeleteLinkeLinklogStoreResponse getInstance(UnmarshallerContext context) {
		return	DeleteLinkeLinklogStoreResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
