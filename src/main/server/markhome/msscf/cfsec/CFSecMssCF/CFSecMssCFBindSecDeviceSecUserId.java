
// Description: Java 11 MssCF Binding for SecDevice Column SecUserId.

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
 *	CFSecMssCFBindSecDeviceSecUserId binds SecDevice.SecUserId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindSecDeviceSecUserId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindSecDeviceSecUserId() {
		super();
	}

	public CFSecMssCFBindSecDeviceSecUserId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecDevice",
			"SecUserId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecDeviceSecUserId.getValueObject() ";

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
		if( genDef instanceof ICFSecSecDeviceObj ) {
			secUserId = ((ICFSecSecDeviceObj)genDef).getRequiredSecUserId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecDeviceObj" );
		}

		return( secUserId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindSecDeviceSecUserId.expandBody() ";

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

		if( genDef instanceof ICFSecSecDeviceObj ) {
			UUID secUserId = ((ICFSecSecDeviceObj)genDef).getRequiredSecUserId();
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
				"ICFSecSecDeviceObj" );
		}

		return( ret );
	}

}
