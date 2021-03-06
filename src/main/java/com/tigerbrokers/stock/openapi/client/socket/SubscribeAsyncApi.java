package com.tigerbrokers.stock.openapi.client.socket;

import com.tigerbrokers.stock.openapi.client.struct.enums.Subject;
import java.util.List;
import java.util.Set;

/**
 * Description:
 * Created by lijiawen on 2018/08/29.
 */
public interface SubscribeAsyncApi {

  /**
   * 订阅主题
   *
   * @param subject 主题
   */
  void subscribe(Subject subject);

  /**
   * 订阅主题字段
   *
   * @param subject 主题
   * @param focusKeys 关注key列表
   */
  void subscribe(Subject subject, List<String> focusKeys);

  /**
   * 取消订阅主题
   *
   * @param subject 主题
   */
  void cancelSubscribe(Subject subject);

  /**
   * 订阅行情
   *
   * @param symbols 标的列表
   */
  void subscribeQuote(Set<String> symbols);

  /**
   * 订阅行情字段
   *
   * @param symbols 标的列表
   * @param focusKeys 关注key
   */
  void subscribeQuote(Set<String> symbols, List<String> focusKeys);

  /**
   * 取消订阅行情
   *
   * @param symbols 标的列表
   */
  void cancelSubscribeQuote(Set<String> symbols);

  /**
   * 查询已订阅symbol列表
   */
  void getSubscribedSymbols();
}
