/**
 *
 */
package com.xml.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class DateUtil {

	/**
	 * 格式化时间
	 *
	 * @param date
	 * @param pattern
	 * @return
	 */

	public static String getDateFormat(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
	public static Date toDate(String time, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date handleDate = null;
		try {
			handleDate = sdf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return handleDate;
	}

	/**
	 * 时间戳转换成日期格式字符串
	 * 
	 * @param seconds
	 * @param formatStr
	 * @return
	 */
	public static String timeStamp2Date(String seconds, String format) {
		if (seconds == null || seconds.isEmpty() || seconds.equals("null")) {
			return "";
		}
		if (format == null || format.isEmpty()) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		if (seconds.contains("-")) {
			return seconds;
		} else {

			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.format(Long.valueOf(seconds));
		}
	}

	/**
	 * 获取给定日期的凌晨零点零分的日期对象
	 *
	 * @param date
	 * @return
	 */
	public static Date getTimeOf12(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获取给定日期下个月的第一天凌晨零点零分的日期对象
	 *
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfNextMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获取给定日期所在周的第一天的凌晨零点零分的日期对象
	 *
	 * @param date
	 * @param dayNum
	 * @return
	 */
	public static Date getFirstDateOfWeek(Date date, int dayNum) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_WEEK, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获取给定日期所属月份的第一天凌晨零点零分的日期对象
	 *
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 获取加减日期后的凌晨零点零分的日期对象
	 *
	 * @param date
	 * @param dayNum
	 * @return
	 */
	public static Date changedByDateNum(Date date, int dayNum) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, dayNum);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 判断给定的两个日期是否是同一天
	 *
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static boolean isSameDay(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
				&& cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
	}

	/**
	 * 将指定格式的日期字符串解析成Date类型
	 *
	 * @param dateStr
	 *            格式为：yyyy-MM-dd
	 * @return
	 */
	public static Date parse(String dateStr) {
		if (dateStr == null) {
			return null;
		}
		String[] split = dateStr.split("-");

		String errorInfo = "合法的格式是：yyyy-MM-dd";
		if (split.length != 3) {
			throw new IllegalArgumentException(errorInfo);
		}
		Calendar result = Calendar.getInstance();

		int year = 0;
		try {
			year = Integer.valueOf(split[0]);
			result.set(Calendar.YEAR, year);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(errorInfo);
		}

		int month = 0;
		try {
			month = Integer.valueOf(split[1]);
			result.set(Calendar.MONTH, month - 1);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(errorInfo);
		}

		int day = 0;
		try {
			day = Integer.valueOf(split[2]);
			result.set(Calendar.DAY_OF_MONTH, day);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(errorInfo);
		}
		result.set(Calendar.HOUR_OF_DAY, 0);
		result.set(Calendar.MINUTE, 0);
		result.set(Calendar.SECOND, 0);
		result.set(Calendar.MILLISECOND, 0);
		return result.getTime();

	}

	public static boolean isEqualMonth(Date date1, Date date2) {
		boolean flag = false;
		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		int month1 = cal.get(Calendar.MONTH);
		int year1 = cal.get(Calendar.YEAR);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		int year2 = cal2.get(Calendar.YEAR);
		int month2 = cal2.get(Calendar.MONTH);
		if (year1 == year2 && month1 == month2) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}


	/**
	 * 计算日期:按天数加减
	 * 
	 * @harvey
	 */
	public static String addDay(String date, int num) throws ParseException {
		String resDate = "";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date handleDate = sdf.parse(date);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(handleDate);
			calendar.add(Calendar.DATE, num);
			resDate = sdf.format(calendar.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resDate;
	}

	/**
	 * 计算日期:按月数加减
	 * 
	 * @harvey
	 */
	public static String addMonth(String date, int num) throws ParseException {
		String resDate = "";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date handleDate = sdf.parse(date);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(handleDate);
			calendar.add(Calendar.MONTH, num);
			resDate = sdf.format(calendar.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resDate;
	}

	/**
	 * 计算日期:按年加减
	 * 
	 * @harvey
	 */
	public static String addYear(String date, int num) throws ParseException {
		String resDate = "";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date handleDate = sdf.parse(date);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(handleDate);
			calendar.add(Calendar.YEAR, num);
			resDate = sdf.format(calendar.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resDate;
	}

	/**
	 * 通过时间秒毫秒数判断两个时间的间隔
	 * 
	 * @author harvey
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int calcDaysByMillisecond(Date date1, Date date2) {
		int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
		days = days + 1;
		return days;
	}

	/**
	 * 字符串的日期格式的计算  第二个参数减去第一个参数的结果
	 */
	public static int daysBetween(String smdate, String bdate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(smdate));
		long time1 = cal.getTimeInMillis();
		cal.setTime(sdf.parse(bdate));
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 获取两个日期相差的月数
	 * 
	 * @param d1
	 *            较大的日期
	 * @param d2
	 *            较小的日期
	 * @return 如果d1>d2返回 月数差 否则返回0
	 */
	public static int getMonthSpace(Date d1, Date d2) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(d1);
		c2.setTime(d2);
		if (c1.getTimeInMillis() < c2.getTimeInMillis()) {
			return 0;
		}
		int year1 = c1.get(Calendar.YEAR);
		int year2 = c2.get(Calendar.YEAR);
		int month1 = c1.get(Calendar.MONTH);
		int month2 = c2.get(Calendar.MONTH);
		int day1 = c1.get(Calendar.DAY_OF_MONTH);
		int day2 = c2.get(Calendar.DAY_OF_MONTH);
		// 获取年的差值 假设 d1 = 2015-8-16 d2 = 2011-9-30
		int yearInterval = year1 - year2;
		// 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
		if (month1 < month2 || (month1 == month2 && day1 < day2)) {
			yearInterval--;
		}
		// 获取月数差值
		int monthInterval = (month1 + 12) - month2;
		if (day1 < day2) {
			monthInterval--;
		}
		monthInterval %= 12;
		return yearInterval * 12 + monthInterval + 1;
	}

	/**
	 * 比较两个日期的大小
	 * 
	 * @param d1
	 * @param d2
	 * @return d1>d2 返回1 d1<d2 返回-1 相等返回 0
	 */
	public static int compareDate(Date d1, Date d2) {
		if (d1.getTime() > d2.getTime()) {
			// System.out.println("dt1 在dt2前");
			return 1;
		} else if (d1.getTime() < d2.getTime()) {
			// System.out.println("dt1在dt2后");
			return -1;
		} else {// 相等
			return 0;
		}
	}

	/**
	 * 获取日期的年、月、日
	 * 
	 * @throws ParseException
	 */
	public static int getPartOfDate(String dateStr, String partType) {
		int partValue = 0;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = sdf.parse(dateStr);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			if ("year".equals(partType)) {
				partValue = calendar.get(Calendar.YEAR);
			} else if ("month".equals(partType)) {
				partValue = calendar.get(Calendar.MONTH) + 1;
			} else if ("day".equals(partType)) {
				partValue = calendar.get(Calendar.DAY_OF_MONTH);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return partValue;
	}

	public static void main(String[] args) throws ParseException {

	}
}
