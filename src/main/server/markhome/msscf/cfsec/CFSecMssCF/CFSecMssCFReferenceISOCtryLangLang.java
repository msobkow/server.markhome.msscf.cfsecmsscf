
// Description: Java 11 MssCF Reference for ISOCtryLang Relationship Lang.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.sql.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;

/**
 *	CFSecMssCFReferenceISOCtryLangLang binds ISOCtryLang.Lang
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceISOCtryLangLang
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceISOCtryLangLang() {
		super();
	}

	public CFSecMssCFReferenceISOCtryLangLang( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOCtryLang",
			"Lang",
			"ISOLang" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceISOCtryLangLang.dereference() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		ICFSecISOLangObj obj;

		if( genDef instanceof ICFSecISOCtryLangObj ) {
			obj = (ICFSecISOLangObj)((ICFSecISOCtryLangObj)genDef).getRequiredParentLang();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOCtryLangObj" );
		}

		return( obj );
	}
}
