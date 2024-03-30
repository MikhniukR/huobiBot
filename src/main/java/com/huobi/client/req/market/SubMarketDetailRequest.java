package com.huobi.client.req.market;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SubMarketDetailRequest {

  private String symbol;

  public String getSymbol() {
    return symbol;
  }
}