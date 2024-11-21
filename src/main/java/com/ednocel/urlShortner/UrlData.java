package com.ednocel.urlShortner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class UrlData {

    private String originalUrl;

    private long expirationTime;
}
