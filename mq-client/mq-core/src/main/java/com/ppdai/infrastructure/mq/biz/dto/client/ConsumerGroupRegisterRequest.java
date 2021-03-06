package com.ppdai.infrastructure.mq.biz.dto.client;

import java.util.List;
import java.util.Map;

import com.ppdai.infrastructure.mq.biz.dto.BaseRequest;

public class ConsumerGroupRegisterRequest extends BaseRequest {
	private long consumerId;
	private String consumerName;
	//子环境，默认是default
	private String subEnv = "default";

	// key为consumerGroupName,value为topic列表
	private Map<String, List<String>> consumerGroupNames;

	public long getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(long consumerId) {
		this.consumerId = consumerId;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getSubEnv() {
		return subEnv;
	}

	public void setSubEnv(String subEnv) {
		this.subEnv = subEnv;
	}

	public Map<String, List<String>> getConsumerGroupNames() {
		return consumerGroupNames;
	}

	public void setConsumerGroupNames(Map<String, List<String>> consumerGroupNames) {
		this.consumerGroupNames = consumerGroupNames;
	}
}
