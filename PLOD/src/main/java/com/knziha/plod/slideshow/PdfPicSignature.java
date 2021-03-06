package com.knziha.plod.slideshow;

import com.bumptech.glide.load.Key;

import java.security.MessageDigest;

public class PdfPicSignature implements Key {
	private final String file;

	public PdfPicSignature(String path) {
		this.file = path;
	}

	@Override
	public void updateDiskCacheKey(MessageDigest messageDigest) {
		byte[] bs = file.getBytes();
		messageDigest.update(bs, 0, bs.length);
	}
}