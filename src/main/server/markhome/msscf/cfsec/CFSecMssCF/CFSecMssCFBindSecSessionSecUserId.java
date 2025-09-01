
// Description: Java 11 MssCF Binding for SecSession Column SecUserId.

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
 *	CFSecMssCFBindSecSessionSecUserId binds SecSession.SecUserId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindSecSessionSecUserId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindSecSessionSecUserId() {
		super();
	}

	public CFSecMssCFBindSecSessionSecUserId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecSession",
			"SecUserId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecSessionSecUserId.getValueObject() ";

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

		UUID secUserId;
		if( genDef instanceof ICFSecSecSessionObj ) {
			secUserId = ((ICFSecSecSessionObj)genDef).getRequiredSecUserId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecSessionObj" );
		}

		return( secUserId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecSessionSecUserId.expandBody() ";

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

		if( genDef instanceof ICFSecSecSessionObj ) {
			UUID secUserId = ((ICFSecSecSessionObj)genDef).getRequiredSecUserId();
			if( secUserId == null ) {
				throw new CFLibNullArgumentException( getClass(),
					"expandBody",
					0,
					"Value" );
			}
			ret = secUserId.toString();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecSessionObj" );
		}

		return( ret );
	}

}
