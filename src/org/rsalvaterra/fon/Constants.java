package org.rsalvaterra.fon;

interface Constants {

	int SECONDS = 1000;

	int CRC_ALREADY_AUTHORISED = 1000;
	int CRC_CREDENTIALS_ERROR = 1001;
	int CRC_WISPR_NOT_PRESENT = 1002;

	int FRC_GENERAL_ERROR = 900;
	int FRC_NOT_ENOUGH_CREDIT = 901;
	int FRC_BAD_CREDENTIALS = 902;
	int FRC_BLACKLISTED = 903;
	int FRC_USER_LIMIT_EXCEEDED = 905;
	int FRC_HOTSPOT_LIMIT_EXCEEDED = 906;
	int FRC_NOT_AUTHORIZED = 907;
	int FRC_PARTNER_ERROR = 908;
	int FRC_INTERNAL_ERROR = 909;
	int FRC_UNKNOWN_ERROR = 910;
	int FRC_INVALID_TEMPORARY_CREDENTIAL = 911;
	int FRC_AUTHORIZATION_CONNECTION_ERROR = 912;
	int FRC_BANNED_REALM = 913;
	int FRC_BANNED_USER = 914;
	int FRC_FLOOD_LIMIT_EXCEEDED = 915;
	int FRC_DATACAP_EXCEEDED = 916;
	int FRC_USER_SUSPENDED = 917;
	int FRC_DEVICE_NOT_AUTHORIZED = 918;
	int FRC_NOT_CREDENTIALS = 920;
	int FRC_INSERT_PROMO_CODE = 922;
	int FRC_VIEW_PROMO_CODE = 923;
	int FRC_NOT_PASS_PURCHASE_AVAILABLE = 924;
	int FRC_NOT_ENOUGH_CREDIT_2 = 925;
	int FRC_INTERNAL_ERROR_2 = 926;
	int FRC_NOT_AUTHORIZED_OWN_HOTSPOT = 927;

	int WMT_INITIAL_REDIRECT = 100;
	int WMT_PROXY_NOTIFICATION = 110;
	int WMT_AUTH_NOTIFICATION = 120;
	int WMT_LOGOFF_NOTIFICATION = 130;
	int WMT_RESPONSE_AUTH_POLL = 140;
	int WMT_RESPONSE_ABORT_LOGIN = 150;

	int WRC_NO_ERROR = 0;
	int WRC_LOGIN_SUCCEEDED = 50;
	int WRC_LOGIN_FAILED = 100;
	int WRC_RADIUS_ERROR = 102;
	int WRC_NETWORK_ADMIN_ERROR = 105;
	int WRC_LOGOFF_SUCCEEDED = 150;
	int WRC_LOGING_ABORTED = 151;
	int WRC_PROXY_DETECTION = 200;
	int WRC_AUTH_PENDING = 201;
	int WRC_ACCESS_GATEWAY_INTERNAL_ERROR = 255;

	String DEFAULT_PERIOD = "300";
	String DEFAULT_MINIMUM_RSSI = "-80";

	String APP_ID = "org.rsalvaterra.fon";

	String ACT_CLEANUP = "0";
	String ACT_CHECK = "1";
	String ACT_CONNECT = "2";
	String ACT_LOGIN = "3";
	String ACT_SCAN = "4";

}
