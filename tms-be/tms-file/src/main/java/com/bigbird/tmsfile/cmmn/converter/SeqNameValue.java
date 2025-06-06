package com.tms_file.cmmn.converter;

import lombok.Data;

import java.io.Serializable;

@Data
public class SeqNameValue implements Serializable {

    private Long seq;

    private String codeName;

    private String fullName;

    public SeqNameValue() {
    }

    public SeqNameValue(Long seq) {
        this.seq = seq;
    }

}
