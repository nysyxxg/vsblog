package run.vue.iblog;

import cn.hutool.crypto.SecureUtil;

public class Md5Test {

	public static void main(String[] args) {
		System.out.println(SecureUtil.md5("123456"));
	}
}
