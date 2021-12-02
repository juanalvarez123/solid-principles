package com.personal.solid.ocp.example2;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@ValidMercadoLibreEmployee
public class MercadoLibreEmployee {

    @NotNull
    public String name;

    @Min(3)
    public int projects;
}
