
// Description: Java 11 MssCF Reference for ISOCtryLang Relationship Ctry.

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
 *	CFSecMssCFReferenceISOCtryLangCtry binds ISOCtryLang.Ctry
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceISOCtryLangCtry
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceISOCtryLangCtry() {
		super();
	}

	public CFSecMssCFReferenceISOCtryLangCtry( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOCtryLang",
			"Ctry",
			"ISOCtry" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceISOCtryLangCtry.dereference() ";

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

		ICFSecISOCtryObj obj;

		if( genDef instanceof ICFSecISOCtryLangObj ) {
			obj = (ICFSecISOCtryObj)((ICFSecISOCtryLangObj)genDef).getRequiredContainerCtry();
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
