package com.hanbong.excel.resource;

import org.apache.poi.ss.usermodel.DataFormat;

public interface DataFormatDecider {

  short getDataFormat(DataFormat dataFormat, Class<?> type);
}
