package com.brothersoft.data.entity.request;

import java.util.List;

public class RegionalBlockRequest {
    private String acronym;
    private String name;
    private List<String> otherAcronyms;
    private List<String> otherNames;

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtherAcronyms(List<String> otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

    public void setOtherNames(List<String> otherNames) {
        this.otherNames = otherNames;
    }
}
