
// Description: Java 11 MssCF Binding for ISOCtryLang Column ISOLangId.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.apache.commons.codec.binary.Base64;

/**
 *	CFSecMssCFBindISOCtryLangISOLangId binds ISOCtryLang.ISOLangId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindISOCtryLangISOLangId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindISOCtryLangISOLangId() {
		super();
	}

	public CFSecMssCFBindISOCtryLangISOLangId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOCtryLang",
			"ISOLangId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOCtryLangISOLangId.getValueObject() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		short iSOLangId;
		if( genDef instanceof ICFSecISOCtryLangObj ) {
			iSOLangId = ((ICFSecISOCtryLangObj)genDef).getRequiredISOLangId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOCtryLangObj" );
		}

		return( iSOLangId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindISOCtryLangISOLangId.expandBody() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String ret;

		if( genDef instanceof ICFSecISOCtryLangObj ) {
			short iSOLangId = ((ICFSecISOCtryLangObj)genDef).getRequiredISOLangId();
			ret = Short.toString( iSOLangId );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOCtryLangObj" );
		}

		return( ret );
	}

}
