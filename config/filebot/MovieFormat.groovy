{
import java.util.function.Function;
import java.util.function.Supplier;

final title = getTitle()
final partStr = safeString({ pi }, { ".part$it" })
final subtStr = safeString({ subt }, Function.identity())

"../$title ($y)/$title ($y)$partStr$subtStr"

String getTitle() {
  final sortPrefixes = ['A', 'An', 'The']
  final originalName = n

  for (final prefix in sortPrefixes) {
    final nameWithoutPrefix = originalName.replaceFirst "^${prefix}\\s", ''
	final hasPrefix = nameWithoutPrefix != originalName

	if (hasPrefix) {
	  return "${nameWithoutPrefix}, $prefix"
    }
  }
  return originalName
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
