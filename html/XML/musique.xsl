<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:output 
  method="html"
  encoding="ISO-8859-1"
  doctype-public="-//W3C//DTD HTML 4.01//EN"
  doctype-system="http://www.w3.org/TR/html4/strict.dtd"
  indent="yes" />
 
<xsl:template match="part">
  <p>
  <xsl:text>Nb de mesures:</xsl:text>
  <xsl:value-of select="count(measure)"/>
  </p>
	<xsl:apply-templates select="@*|*|text()|processing-instruction()" />
</xsl:template>

<xsl:template match="measure">
  <p>
  <xsl:text>Somme pour la mesure </xsl:text>
	<xsl:variable name="somme" select="attributes/time/beats + attributes/time/beat-type"/>
  <xsl:value-of select="concat(@number,':',$somme)"/>
  </p>
	<xsl:apply-templates select="@*|*|text()|processing-instruction()" />
</xsl:template>


<xsl:template match="/">
  <html><body>
    <h1>Voici une partition</h1>
     <xsl:apply-templates select="@*|*|text()|processing-instruction()" />
  </body></html>
</xsl:template>

<xsl:template match="part-name">
  <p class="nom">
  <xsl:text>Nom:</xsl:text>
  <xsl:value-of select="translate(.,'Ms','ZA')"/>
  </p>
</xsl:template>



</xsl:stylesheet>
  
