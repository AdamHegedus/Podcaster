<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:itunes="http://www.itunes.com/dtds/podcast-1.0.dtd">
	<xsl:template match="/">
		<html>
		<body>
		<h2>Items</h2>
		<table border="1">
			<tr>
				<th>Artist</th>
				<th>Title</th>
				<th>Link</th>
			</tr>
			<xsl:for-each select="rss/channel/item">
			<tr>
				<td><xsl:value-of select="author"></xsl:value-of></td>
				<td><xsl:value-of select="title"></xsl:value-of></td>
				<td>
					<xsl:element name="a">
    					<xsl:attribute name="href">
        					<xsl:value-of select="guid"/>
    					</xsl:attribute>
    					<xsl:value-of select="itunes:subtitle"/>
					</xsl:element>
				</td>
			</tr>
			</xsl:for-each>
		</table>
		</body>
		</html>
	</xsl:template>
</xsl:stylesheet>