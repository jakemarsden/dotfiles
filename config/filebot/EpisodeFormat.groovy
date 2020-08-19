{
import java.util.function.Function
import java.util.function.Supplier

final showName = getShowName()
final seasonName = getSeasonName()
final subtStr = safeString({ subt }, Function.identity())

final partNumber = safeString({ di }, Function.identity())
final partCount = safeString({ dc }, Function.identity())
final partStr = (partCount == null || partCount.empty || partCount == '1') ? '' : ".part$partNumber"

"../$showName/$seasonName/$showName ${s00e00.toLowerCase()} $t$partStr$subtStr"

String getShowName() {
  final sortPrefixes = ['A', 'An', 'The']
  final originalName = n

  final nameWithoutYear = originalName.replaceFirst "\\s\\(${y}\\)\$", ''
  final hasAmbiguousYear = nameWithoutYear != originalName

  for (final prefix in sortPrefixes) {
    final nameWithoutYearOrPrefix = nameWithoutYear.replaceFirst "^${prefix}\\s", ''
	final hasPrefix = nameWithoutYearOrPrefix != nameWithoutYear

	if (hasPrefix) {
	  return hasAmbiguousYear ?
	      "${nameWithoutYearOrPrefix}, $prefix ($y)" :
		  "${nameWithoutYearOrPrefix}, $prefix"
	}
  }
  return originalName
}

String getSeasonName() {
  final isSpecial = safeString({ s }, { it == 0 ? '' : (it as String) }).empty
  return isSpecial ? 'Specials' : "Season ${(s as string).padLeft 2, '0'}"
}

String safeString(Supplier<String> factory, Function<String, String> transform) {
  try {
    def result = factory.get()
	if (result == null) {
	  return ''
	}
	result = transform.apply result
	if (result == null) {
	  return ''
	}
	return result
  } catch (Exception e) {
  }
  return ''
}
}
