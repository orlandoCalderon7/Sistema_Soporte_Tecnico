package com.grupo2.soporte_tecnico.exception;

import java.time.LocalDateTime;

public class ErrorResponse {
    private int codigo;
    private String mensaje;
    private LocalDateTime timestamp;

    public ErrorResponse(int codigo, String mensaje) {
        this.codigo    = codigo;
        this.mensaje   = mensaje;
        this.timestamp = LocalDateTime.now();
    }

    public int getCodigo()              { return codigo; }
    public String getMensaje()          { return mensaje; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
