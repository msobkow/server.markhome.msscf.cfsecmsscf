
// Description: Java 11 MssCF Binding for SecUser Column DfltDevUserId.

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
 *	CFSecMssCFBindSecUserDfltDevUserId binds SecUser.DfltDevUserId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindSecUserDfltDevUserId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindSecUserDfltDevUserId() {
		super();
	}

	public CFSecMssCFBindSecUserDfltDevUserId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecUser",
			"DfltDevUserId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecUserDfltDevUserId.getValueObject() ";

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

		UUID dfltDevUserId;
		if( genDef instanceof ICFSecSecUserObj ) {
			dfltDevUserId = ((ICFSecSecUserObj)genDef).getOptionalDfltDevUserId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecUserObj" );
		}

		return( dfltDevUserId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecUserDfltDevUserId.expandBody() ";

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

		if( genDef instanceof ICFSecSecUserObj ) {
			UUID dfltDevUserId = ((ICFSecSecUserObj)genDef).getOptionalDfltDevUserId();
			if( dfltDevUserId == null ) {
				ret = null;
			}
			else {
				ret = dfltDevUserId.toString();
			}
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecUserObj" );
		}

		return( ret );
	}

}
