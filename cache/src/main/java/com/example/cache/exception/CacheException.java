package com.example.cache.exception;

public class CacheException extends RuntimeException {

	public CacheException(String message) {
		super(message);
	}

	public CacheException(String message, Throwable cause) {
		super(message, cause);
	}
}
