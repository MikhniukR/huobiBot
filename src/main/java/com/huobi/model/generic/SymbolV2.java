package com.huobi.model.generic;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SymbolV2 {
    private String sc;
    private  String dn;
    private String bc;
    private String bcdn;
    private String qc;
    private String qcdn;
    private String state;
    private Boolean whe;
    private Boolean cd;
    private Boolean te;
    private Long toa;
    private String sp;
    private Integer w;
    private BigDecimal ttp;
    private BigDecimal tap;
    private BigDecimal tpp;
    private BigDecimal fp;
    @JSONField(name = "suspend_desc")
    private String suspendDesc;
    @JSONField(name = "transfer_board_desc")
    private String transferBoardDesc;
    private String tags;
    private BigDecimal lr;
    private BigDecimal smlr;
    private String flr;
    private String wr;
    private Integer d;
    private String elr;
    private Person p1;
    private String castate;
    private String ca1oa;
    private String ca2oa;

    @Override
    public String toString() {
        return "SymbolV2{" +
                "sc='" + sc + '\'' +
                ", dn='" + dn + '\'' +
                ", bc='" + bc + '\'' +
                ", bcdn='" + bcdn + '\'' +
                ", qc='" + qc + '\'' +
                ", qcdn='" + qcdn + '\'' +
                ", state='" + state + '\'' +
                ", whe=" + whe +
                ", cd=" + cd +
                ", te=" + te +
                ", toa=" + toa +
                ", sp='" + sp + '\'' +
                ", w=" + w +
                ", ttp=" + ttp +
                ", tap=" + tap +
                ", tpp=" + tpp +
                ", fp=" + fp +
                ", suspendDesc='" + suspendDesc + '\'' +
                ", transferBoardDesc='" + transferBoardDesc + '\'' +
                ", tags='" + tags + '\'' +
                ", lr=" + lr +
                ", smlr=" + smlr +
                ", flr='" + flr + '\'' +
                ", wr='" + wr + '\'' +
                ", d=" + d +
                ", elr='" + elr + '\'' +
                ", p1=" + p1 +
                ", castate='" + castate + '\'' +
                ", ca1oa='" + ca1oa + '\'' +
                ", ca2oa='" + ca2oa + '\'' +
                "}\n";
    }
}