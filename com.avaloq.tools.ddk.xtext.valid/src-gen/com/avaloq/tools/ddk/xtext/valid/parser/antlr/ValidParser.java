/*
 * generated by Xtext
 */
package com.avaloq.tools.ddk.xtext.valid.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.avaloq.tools.ddk.xtext.valid.services.ValidGrammarAccess;

public class ValidParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ValidGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.avaloq.tools.ddk.xtext.valid.parser.antlr.internal.InternalValidParser createParser(XtextTokenStream stream) {
		return new com.avaloq.tools.ddk.xtext.valid.parser.antlr.internal.InternalValidParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ValidModel";
	}
	
	public ValidGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ValidGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}