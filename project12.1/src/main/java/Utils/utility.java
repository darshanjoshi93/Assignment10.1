package Utils;
public class utility {
	public static String api()
    {
	String uri = "https://moolya.com";
	return uri;
    }
	public static String body(String name, String password)
    {
	String body = "{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"leader\"\r\n"
			+ "}";
	return body;
}
}