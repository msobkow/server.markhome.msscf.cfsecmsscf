
// Description: Java 11 MssCF Reference for ISOCtryCcy Relationship Ctry.

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
 *	CFSecMssCFReferenceISOCtryCcyCtry binds ISOCtryCcy.Ctry
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceISOCtryCcyCtry
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceISOCtryCcyCtry() {
		super();
	}

	public CFSecMssCFReferenceISOCtryCcyCtry( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"ISOCtryCcy",
			"Ctry",
			"ISOCtry" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceISOCtryCcyCtry.dereference() ";

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

		if( genDef instanceof ICFSecISOCtryCcyObj ) {
			obj = (ICFSecISOCtryObj)((ICFSecISOCtryCcyObj)genDef).getRequiredContainerCtry();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecISOCtryCcyObj" );
		}

		return( obj );
	}
}
