package org.alking.huobiapi;

import org.alking.huobiapi.misc.HuobiWSClientOption;
import org.alking.huobiapi.misc.HuobiWSEventHandler;

public interface HuobiApiWSClient {

    void setOption(HuobiWSClientOption option);

    HuobiWSClientOption getOption();

    void depth(String symbol, String type, HuobiWSEventHandler handler) throws HuobiApiException;

    void kline(String symbol, String period, HuobiWSEventHandler handler) throws HuobiApiException;

    void tradeDetail(String symbol, HuobiWSEventHandler handler) throws HuobiApiException;

    void marketDetail(String symbol, HuobiWSEventHandler handler) throws HuobiApiException;
}
