package me.chanjar.weixin.common.session;

import java.util.Enumeration;

/**
 * Created by qianjia on 15/1/21.
 */
public interface WxSession {

  public Object getAttribute(String name);

  public Enumeration<String> getAttributeNames();

  public void setAttribute(String name, Object value);

  public void removeAttribute(String name);

  public void invalidate();

}
