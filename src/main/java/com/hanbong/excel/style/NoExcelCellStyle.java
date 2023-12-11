package com.hanbong.excel.style;

import org.apache.poi.ss.usermodel.CellStyle;

public class NoExcelCellStyle implements ExcelCellStyle {

  @Override
  public void apply(CellStyle cellStyle) {
    // Empty
  }
}
