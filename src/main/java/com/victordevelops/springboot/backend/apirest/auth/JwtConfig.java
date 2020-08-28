package com.victordevelops.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEowIBAAKCAQEAr8qHZOUTbzhW4BwSsG/C8uViHQi+rjDVe9VqdE6ihjOgpM8i\r\n"
			+ "JU8VVP1QitM4UgPojN4zBcS6PZO9PiPrD0pUeD/xEvhuwCkqBEeExWuVMICvedTX\r\n"
			+ "6ZAH6r5UWN/CoSPzvFjaD9uZKZwFcBkEqEba51inUzkiqkHQksLd2eGf62yRjg31\r\n"
			+ "AwSu/qlKHbS0jVLd6lQsip1HwA/xYgiSkt1I9TN7TOYLfLJN/A1DUJ6mAC0HKAX+\r\n"
			+ "W22VlWNL59jr30Hq0/tWk6orVgr9a9Jnqj8YQIET/NYSDHT9opGoYPC9A30xou44\r\n"
			+ "f7vy5s/kFGcOMxDmNBY/c692lC15uc5jSkF/mwIDAQABAoIBAGM4vmktf2W0eByw\r\n"
			+ "27+opXGyFUnsCKyLNcRatmaFh+iVtWOw4kYKuDCrdk2VYOGyAQ2Z0VS9MJ3XCObN\r\n"
			+ "IT0VKE5jUO/zN5fQ5D1cHM3Npnyk9eafQ2s6d62A1lz/l3yarVUvFY4D1hSNUuht\r\n"
			+ "xpowvBf+ixtHUZCl61MbGFuFpV0ckAQy5pHxB3KcgDG4oHvcEUWngphtvlam1wfB\r\n"
			+ "1QOMA9jixHOyZlOokK36J0VP8ZltX0RzJ2S1vlNuCnwjnRzCpScumy21BLBIe+P6\r\n"
			+ "YYSoaNd89dEB+jMN8VfMRjL8/9hIuI193CKK4tthK+h3xXB+Qb/Lqzr5rj/7vlff\r\n"
			+ "eZNrirECgYEA2zpMlYERnFAJDNj7I0erFIB/i3lBf+UxnGSpPKZMNBNtQ9mL9AjC\r\n"
			+ "tnF0odbanVNf15bhP4k9iAEgjg1XxjrwfKqJXYUnfQiQ7u6c9EhcgZuwz21WTHja\r\n"
			+ "4U8dU0jJhbZTUc1VXHUAFXMv2xeuVxlgGFLhCxyK+9g43XhG3jo2tCkCgYEAzUcM\r\n"
			+ "uefWXtwUr82KHIn3AYjUV/yWYs30EmG42u95IjDhIqoxGcjjFYb2zDUHYsPMgnvj\r\n"
			+ "MAd5s6wiXhzYPbdPVX+BKwOr4+vf1GwLN79MxlPUfL4ByacPznwfXkFif8IXFEGn\r\n"
			+ "DKK3kIjEcwbz0Vy5x0/L0T1mAlFreC54prYbriMCgYBO5p2XlTtkWb3YHOPOH8Yn\r\n"
			+ "+9NrvDlhsXh4hBYQ2P1GJNPHfq2LJ/gEN7M1aCGIS/CLpCbvehJmN5mi5pR3qNDS\r\n"
			+ "3YHQ4dKDgqi/BawBk2WP1Bv/m6daoIiOXK3+Qo0dDbDRGSimvQlJrwpDPTOm72AR\r\n"
			+ "gQqzuBMhbwGQW/CNnMABeQKBgQCIj/7QYoKDougEOLnr2IDBvZR+YGRvoNIBtI80\r\n"
			+ "32F3tIrh89UscS9ZL+tZ2OFr/BQ+rkpqtl5pgFdwwsG89QlLOMLmqc+dllrWx3YD\r\n"
			+ "BTn/Kt/OiN1JmOF0HbEElH0Bv055RF/skQeLmOEQIQztOEHDbbuLHMyTODVFw6yy\r\n"
			+ "Q65QfwKBgGIuygJ4qRjuXejJY/YvqjG7noWtlJU6oMw90bcsuaIQH6yR40D6afbc\r\n"
			+ "GOHuRf46vVHbqYYVZEQtvYwlUgN+McKRx5YFvPY0N2M/ivrnSEhn0Fbj5yAyGUQT\r\n"
			+ "UgXOKbzRuJlvbQjRCXIe9g1JlIBAiLdTzWBJwEmXe2ZLyHblYdeR\r\n" + "-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAr8qHZOUTbzhW4BwSsG/C\r\n"
			+ "8uViHQi+rjDVe9VqdE6ihjOgpM8iJU8VVP1QitM4UgPojN4zBcS6PZO9PiPrD0pU\r\n"
			+ "eD/xEvhuwCkqBEeExWuVMICvedTX6ZAH6r5UWN/CoSPzvFjaD9uZKZwFcBkEqEba\r\n"
			+ "51inUzkiqkHQksLd2eGf62yRjg31AwSu/qlKHbS0jVLd6lQsip1HwA/xYgiSkt1I\r\n"
			+ "9TN7TOYLfLJN/A1DUJ6mAC0HKAX+W22VlWNL59jr30Hq0/tWk6orVgr9a9Jnqj8Y\r\n"
			+ "QIET/NYSDHT9opGoYPC9A30xou44f7vy5s/kFGcOMxDmNBY/c692lC15uc5jSkF/\r\n" + "mwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
