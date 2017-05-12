package com.burau.scott.model;


public class HomeResponse {
    private String errorMessage;

    public HomeResponse() {}

    public HomeResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HomeResponse that = (HomeResponse) o;

        return errorMessage != null ? errorMessage.equals(that.errorMessage) : that.errorMessage == null;
    }

    @Override
    public int hashCode() {
        return errorMessage != null ? errorMessage.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "HomeResponse{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
