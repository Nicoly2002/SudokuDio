package br.com.dio.model;

public enum GameStatusEnum {

    NOW_STARTED,
    INCOMPLETE,
    COMPLETE,
    ;

    private String label;

    GameStatusEnum(final String label){
        this.label = label;
    }

    GameStatusEnum() {

    }

    public String getLabel() {
        return label;
    }


}
